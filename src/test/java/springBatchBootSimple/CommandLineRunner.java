package springBatchBootSimple;

import lombok.extern.slf4j.Slf4j;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.CommandLineJobRunner;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("commandLine")
@DirtiesContext
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:tasklet.xml")
public class CommandLineRunner {
    @Autowired
    private JobLauncher  jobLauncher;
    @Autowired
    private JobRegistry jobRegistry;
    @Autowired
    private Tasklet helloTasklet;
    @Autowired
    private Job taskletSimple;
  
    @Test
    public void shouldCommandLineRunWork() throws Exception {
         Assertions.assertThat(jobLauncher).isNotNull();
         Assertions.assertThat(jobRegistry).isNotNull();
         Assertions.assertThat(helloTasklet).isNotNull();
         Assertions.assertThat(taskletSimple).isNotNull();
        /*String[] args = new String[] { "tasklet.xml", "taskletSimple" };
        CommandLineJobRunner.main(args);*/
    }

}
