package com.assetgro.stockgro.di.modules;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/assetgro/stockgro/di/modules/DoubleGsonAdapter;", "Lcom/google/gson/JsonDeserializer;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class DoubleGsonAdapter implements JsonDeserializer<Double> {
    @Override // com.google.gson.JsonDeserializer
    public final Double deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) {
        double d10;
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            d10 = json.getAsDouble();
        } catch (NumberFormatException unused) {
            String asString = json.getAsString();
            Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
            String n10 = s.n(asString, ",", HttpUrl.FRAGMENT_ENCODE_SET, false);
            if (n10.length() > 0) {
                d10 = Double.parseDouble(n10);
            } else {
                d10 = 0.0d;
            }
        }
        return Double.valueOf(d10);
    }
}
