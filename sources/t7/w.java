package t7;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public final View f35536b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f35535a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f35537c = new ArrayList();

    public w(View view) {
        this.f35536b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f35536b == wVar.f35536b && this.f35535a.equals(wVar.f35535a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f35535a.hashCode() + (this.f35536b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder r10 = da.e.r("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        r10.append(this.f35536b);
        r10.append("\n");
        String r11 = jr.h.r(r10.toString(), "    values:");
        HashMap hashMap = this.f35535a;
        for (String str : hashMap.keySet()) {
            r11 = r11 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return r11;
    }
}
