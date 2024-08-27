package al;

import com.facebook.FacebookSdk;
import java.util.Arrays;

/* loaded from: classes.dex */
public enum e {
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONS(FacebookSdk.DATA_PROCESSION_OPTIONS),
    /* JADX INFO: Fake field, exist only in values array */
    COUNTRY(FacebookSdk.DATA_PROCESSION_OPTIONS_COUNTRY),
    /* JADX INFO: Fake field, exist only in values array */
    STATE(FacebookSdk.DATA_PROCESSION_OPTIONS_STATE);


    /* renamed from: a, reason: collision with root package name */
    public final String f642a;

    e(String str) {
        this.f642a = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        return (e[]) Arrays.copyOf(values(), 3);
    }
}
