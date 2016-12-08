package com.timurkashapov.jwl.api.utils;
/**
 * Report for all.
 * Регистрация и отчетность по операциям.
 * Created by Timur Kashapov on 04.12.2016.
 */
public interface Reportable {

    /**
     * Start the measure for operation.
     * Запустить измерение операции.
     */
    void startMeasure(final String title);

    /**
     * Stop the measure for operation.
     * Закончить измерение для операции.
     */
    void endMeasure(final String title);

    /**
     * Get report for operation.
     * Получить отчет по операции.
     */
    void getReport();
}
