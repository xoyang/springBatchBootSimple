package pl.java.scalatech.tasklet;

import lombok.extern.slf4j.Slf4j;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SuccessTasklet implements Tasklet {

        @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        log.info("success tasklet -> finished");
        return RepeatStatus.FINISHED;
    }

}