package io.github.karol2846.modularizator;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(AnalysisConfig.USAGE);
            return;
        }
        AnalysisConfig config;
        try {
            config = AnalysisConfig.parse(args);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.err.println(AnalysisConfig.USAGE);
            System.exit(2);
            return;
        }
        System.out.println("Config: " + config);
    }
}
