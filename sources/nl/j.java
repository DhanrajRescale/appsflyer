package nl;

import android.content.Intent;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final ll.e f28865b = new ll.e(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f28866c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f28867a = new HashMap();

    public final boolean a(int i10, int i11, Intent intent) {
        h hVar;
        h hVar2 = (h) this.f28867a.get(Integer.valueOf(i10));
        if (hVar2 == null) {
            synchronized (f28865b) {
                hVar = (h) f28866c.get(Integer.valueOf(i10));
            }
            if (hVar == null) {
                return false;
            }
            hVar.a(i11, intent);
            return true;
        }
        hVar2.a(i11, intent);
        return true;
    }
}
