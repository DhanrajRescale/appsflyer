package nl;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public static final ll.f f28873b = new ll.f(2, 0);

    /* renamed from: a, reason: collision with root package name */
    public Uri f28874a;

    public k(String action, Bundle bundle) {
        Uri n10;
        Intrinsics.checkNotNullParameter(action, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        b0[] valuesCustom = b0.valuesCustom();
        ArrayList arrayList = new ArrayList(valuesCustom.length);
        for (b0 b0Var : valuesCustom) {
            arrayList.add(b0Var.f28836a);
        }
        if (arrayList.contains(action)) {
            n10 = n0.b(a3.a.m(new Object[]{FacebookSdk.getFacebookGamingDomain()}, 1, "%s", "java.lang.String.format(format, *args)"), Intrinsics.i(action, "/dialog/"), bundle);
        } else {
            n10 = f28873b.n(bundle, action);
        }
        this.f28874a = n10;
    }
}
