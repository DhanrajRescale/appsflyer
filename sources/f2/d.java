package f2;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.webengage.sdk.android.z0;
import d4.y2;
import e4.k;
import java.util.Objects;
import t0.t;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15906a;

    /* renamed from: b, reason: collision with root package name */
    public final View f15907b;

    public d(ContentCaptureSession contentCaptureSession, View view) {
        this.f15906a = contentCaptureSession;
        this.f15907b = view;
    }

    public final AutofillId a(long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession h10 = y2.h(this.f15906a);
            k T = t.T(this.f15907b);
            Objects.requireNonNull(T);
            return b.a(h10, z0.f(T.f14993a), j10);
        }
        return null;
    }
}
