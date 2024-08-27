package al;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.Arrays;

/* loaded from: classes.dex */
public enum l {
    VALUE_TO_SUM(AppMeasurementSdk.ConditionalUserProperty.VALUE),
    EVENT_TIME("event_time"),
    EVENT_NAME("event_name"),
    CONTENT_IDS("content_ids"),
    CONTENTS("contents"),
    CONTENT_TYPE("content_type"),
    DESCRIPTION("description"),
    LEVEL("level"),
    MAX_RATING_VALUE("max_rating_value"),
    NUM_ITEMS("num_items"),
    PAYMENT_INFO_AVAILABLE("payment_info_available"),
    REGISTRATION_METHOD("registration_method"),
    SEARCH_STRING("search_string"),
    SUCCESS("success"),
    ORDER_ID(PaymentConstants.ORDER_ID),
    AD_TYPE("ad_type"),
    CURRENCY("currency");


    /* renamed from: a, reason: collision with root package name */
    public final String f680a;

    l(String str) {
        this.f680a = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static l[] valuesCustom() {
        return (l[]) Arrays.copyOf(values(), 17);
    }
}
