package yk;

import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final m f41723a;

    public r(m loggerImpl) {
        Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
        this.f41723a = loggerImpl;
    }

    public final void a(Bundle bundle, String str) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.f41723a.f(str, bundle);
        }
    }

    public r(Context context) {
        this(new m(context, (String) null));
    }

    public r(Context context, String str) {
        this(new m(context, str));
    }
}
