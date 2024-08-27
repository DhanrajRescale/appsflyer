package a4;

import android.content.ClipData;
import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.view.ContentInfo;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.window.SplashScreenView;
import e5.n;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ boolean B(Object obj) {
        return obj instanceof SplashScreenView;
    }

    public static /* bridge */ /* synthetic */ int C(ContentInfo contentInfo) {
        return contentInfo.getSource();
    }

    public static /* bridge */ /* synthetic */ int a(Configuration configuration) {
        return configuration.fontWeightAdjustment;
    }

    public static /* bridge */ /* synthetic */ int b(ContentInfo contentInfo) {
        return contentInfo.getFlags();
    }

    public static /* bridge */ /* synthetic */ ClipData c(ContentInfo contentInfo) {
        return contentInfo.getClip();
    }

    public static /* synthetic */ ContentInfo.Builder e(ClipData clipData, int i10) {
        return new ContentInfo.Builder(clipData, i10);
    }

    public static /* bridge */ /* synthetic */ ContentInfo g(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ ViewTranslationRequest.Builder k(AutofillId autofillId, long j10) {
        return new ViewTranslationRequest.Builder(autofillId, j10);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse m(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* bridge */ /* synthetic */ SplashScreenView n(Object obj) {
        return (SplashScreenView) obj;
    }

    public static /* synthetic */ void p() {
    }

    public static /* bridge */ /* synthetic */ void s(TelephonyManager telephonyManager, n nVar) {
        telephonyManager.unregisterTelephonyCallback(nVar);
    }

    public static /* bridge */ /* synthetic */ void t(TelephonyManager telephonyManager, Executor executor, n nVar) {
        telephonyManager.registerTelephonyCallback(executor, nVar);
    }
}
