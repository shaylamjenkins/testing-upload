package io.matty.wrike;

public class WrikeParameterBuilder {

    private final StringBuilder params = new StringBuilder();

    public static WrikeParameterBuilder create() {
        return new WrikeParameterBuilder();
    }

    public WrikeParameterBuilder() {
        this.params.append("?");
    }

    public WrikeParameterBuilder key(String parameterName) {
        if (!this.params.toString().endsWith("?")) {
            if (this.params.toString().endsWith("\"")) {
                this.params.append("}");
            }

            this.params.append("&");
        }

        this.params.append(parameterName).append("=");
        return this;
    }

    public WrikeParameterBuilder value(String value) {
        this.params.append(value);
        return this;
    }

    public WrikeParameterBuilder jsonKeyValue(String key, String value) {
        if (this.params.toString().endsWith("\"")) {
            this.params.append(",");
        }

        if (this.params.toString().endsWith("=")) {
            this.params.append("{");
        }

        this.params.append("\"").append(key).append("\"")
                .append(":")
                .append("\"").append(value).append("\"");
        return this;
    }

    @Override
    public String toString() {
        if (this.params.toString().endsWith("\"")) {
            this.params.append("}");
        }

        return this.params.toString();
    }
}
