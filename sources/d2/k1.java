package d2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class k1 implements g3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13472a;

    public k1(Context context) {
        this.f13472a = context;
    }

    public final void a(String str) {
        try {
            this.f13472a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e10) {
            throw new IllegalArgumentException("Can't open " + str + '.', e10);
        }
    }
}
