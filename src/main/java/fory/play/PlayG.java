package fory.play;

import java.util.concurrent.*;

public class PlayG {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureTask future = new FutureTask<>(() -> {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(10);
            }
            return "dye";
        });

        Executor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue<>(1));

        executor.execute(future);

        while (true) {
            Thread.sleep(10);
            if (future.isDone()) {
                System.out.println("done");
                break;
            } else {
                System.out.println("waiting..");
            }
        }
        System.out.println(future.get());


    }

}
