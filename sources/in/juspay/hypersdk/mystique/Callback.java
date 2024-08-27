package in.juspay.hypersdk.mystique;

/* loaded from: classes2.dex */
public interface Callback {
    void onError(String str, String str2);

    void onException(String str, String str2, Throwable th2);

    void webViewLoaded(Exception exc);
}
