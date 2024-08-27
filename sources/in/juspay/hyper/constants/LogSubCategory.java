package in.juspay.hyper.constants;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes2.dex */
public class LogSubCategory {

    @Keep
    /* loaded from: classes2.dex */
    public static class Action {
        public static final String DUI = "dynamic_ui";
        public static final String SYSTEM = "system";
        public static final String USER = "user";
    }

    @Keep
    /* loaded from: classes2.dex */
    public static class ApiCall {
        public static final String NETWORK = "network";
        public static final String SDK = "external_sdk";
    }

    @Keep
    /* loaded from: classes2.dex */
    public static class Context {
        public static final String DEVICE = "device";
    }

    @Keep
    /* loaded from: classes2.dex */
    public static class LifeCycle {
        public static final String ANDROID = "android";
        public static final String HYPER_SDK = "hypersdk";
    }
}
