package aq;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zzvz;
import d7.i0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f2744a = new Logger("GetTokenResultFactory", new String[0]);

    public static i0 a(String str) {
        Map hashMap;
        try {
            hashMap = n.b(str);
        } catch (zzvz e10) {
            f2744a.e("Error parsing token claims", e10, new Object[0]);
            hashMap = new HashMap();
        }
        return new i0(str, hashMap);
    }
}
