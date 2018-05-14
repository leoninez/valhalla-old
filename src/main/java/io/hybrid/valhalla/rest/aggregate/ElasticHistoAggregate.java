package io.hybrid.valhalla.rest.aggregate;


import io.hybrid.valhalla.rest.type.ElasticAggregateType;

public class ElasticHistoAggregate extends ElasticAggregateFieldAbstract {
    private int interval;

    public ElasticHistoAggregate(String name, String field, int interval) {
        super(name, field);
        this.interval = interval;
    }

    @Override
    public ElasticAggregateType type() {
        return ElasticAggregateType.histogram;
    }

    public int getInterval() {
        return interval;
    }
}
