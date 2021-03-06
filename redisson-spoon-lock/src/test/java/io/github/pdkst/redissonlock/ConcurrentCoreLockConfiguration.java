package io.github.pdkst.redissonlock;

import io.github.pdkst.redisson.spoon.lock.LockProcessor;
import io.github.pdkst.redisson.spoon.lock.invoker.ConcurrentCoreLockInvoker;
import io.github.pdkst.redisson.spoon.lock.invoker.DefaultLockProcessor;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author pdkst
 * @since 2021/5/23
 */
public class ConcurrentCoreLockConfiguration {

    @Bean
    public LockProcessor lockProcessor(){
        return new DefaultLockProcessor(new ConcurrentCoreLockInvoker(ReentrantLock::new));
    }
}
