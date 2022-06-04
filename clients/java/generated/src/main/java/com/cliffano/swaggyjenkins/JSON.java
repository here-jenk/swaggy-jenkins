/*
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cliffano.swaggyjenkins;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        gson = createGson()
            .registerTypeAdapter(Date.class, dateTypeAdapter)
            .registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter)
            .registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter)
            .registerTypeAdapter(LocalDate.class, localDateTypeAdapter)
            .registerTypeAdapter(byte[].class, byteArrayAdapter)
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.AllView.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.BranchImpl.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.BranchImpllinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.BranchImplpermissions.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.CauseAction.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.CauseUserIdCause.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.ClassesByClass.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.ClockDifference.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.ComputerSet.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.DefaultCrumbIssuer.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.DiskSpaceMonitorDescriptorDiskSpace.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.EmptyChangeLogSet.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.ExtensionClassContainerImpl1.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.ExtensionClassContainerImpl1links.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.ExtensionClassContainerImpl1map.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.ExtensionClassImpl.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.ExtensionClassImpllinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.FavoriteImpl.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.FavoriteImpllinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.FreeStyleBuild.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.FreeStyleProject.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.FreeStyleProjectactions.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.FreeStyleProjecthealthReport.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.GenericResource.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.GithubContent.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.GithubFile.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.GithubOrganization.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.GithubOrganizationlinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.GithubRepositories.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.GithubRepositorieslinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.GithubRepository.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.GithubRepositorylinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.GithubRepositorypermissions.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.GithubRespositoryContainer.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.GithubRespositoryContainerlinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.GithubScm.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.GithubScmlinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.Hudson.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.HudsonMasterComputer.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.HudsonMasterComputerexecutors.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.HudsonMasterComputermonitorData.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.HudsonassignedLabels.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.InputStepImpl.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.InputStepImpllinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.Label1.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.Link.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.ListView.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.MultibranchPipeline.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.NullSCM.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.Organisation.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.Pipeline.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelineActivity.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelineActivityartifacts.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelineBranchesitem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelineBranchesitemlatestRun.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelineBranchesitempullRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelineBranchesitempullRequestlinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelineFolderImpl.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelineImpl.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelineImpllinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelineRun.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelineRunImpl.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelineRunImpllinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelineRunNode.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelineRunNodeedges.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelineRunartifacts.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelineStepImpl.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelineStepImpllinks.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelinelatestRun.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.PipelinelatestRunartifacts.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.Queue.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.QueueBlockedItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.QueueItemImpl.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.QueueLeftItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.ResponseTimeMonitorData.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.StringParameterDefinition.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.StringParameterValue.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.SwapSpaceMonitorMemoryUsage2.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.UnlabeledLoadStatistics.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.cliffano.swaggyjenkins.model.User.CustomTypeAdapterFactory())
            .create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
