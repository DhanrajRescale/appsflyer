package q;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import r3.k;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f31447a;

    public f(Intent intent) {
        this.f31447a = intent;
    }

    public final void a(Context context, Uri uri) {
        Intent intent = this.f31447a;
        intent.setData(uri);
        k.startActivity(context, intent, null);
    }
}
