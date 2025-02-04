package com.bolingcavalry.interceptor;

import com.bolingcavalry.interceptor.meta.HandleError;
import io.quarkus.arc.Priority;
import io.quarkus.logging.Log;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 * @author will
 * @email zq2599@gmail.com
 * @date 2022/3/26 22:36
 * @description HandleError的实现
 */
@HandleError
@Interceptor
@Priority(Interceptor.Priority.APPLICATION +1)
public class HandleErrorInterceptor {

    @Inject
    Logger logger;

    @AroundInvoke
    Object execute(InvocationContext context) {

        try {
            return context.proceed();
        } catch (Exception exception) {
            Log.error("exccute method error", exception);
        }

        return null;
    }
}
