package d4;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class m2 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final g2 f13784a;

    /* renamed from: b, reason: collision with root package name */
    public List f13785b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f13786c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f13787d;

    public m2(g2 g2Var) {
        super(g2Var.f13743b);
        this.f13787d = new HashMap();
        this.f13784a = g2Var;
    }

    public final p2 a(WindowInsetsAnimation windowInsetsAnimation) {
        p2 p2Var = (p2) this.f13787d.get(windowInsetsAnimation);
        if (p2Var == null) {
            p2Var = new p2(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                p2Var.f13805a = new n2(windowInsetsAnimation);
            }
            this.f13787d.put(windowInsetsAnimation, p2Var);
        }
        return p2Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f13784a.a(a(windowInsetsAnimation));
        this.f13787d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        g2 g2Var = this.f13784a;
        a(windowInsetsAnimation);
        g2Var.b();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f13786c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f13786c = arrayList2;
            this.f13785b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation l10 = com.appsflyer.internal.k.l(list.get(size));
            p2 a10 = a(l10);
            fraction = l10.getFraction();
            a10.f13805a.d(fraction);
            this.f13786c.add(a10);
        }
        return this.f13784a.c(d3.g(null, windowInsets), this.f13785b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        g2 g2Var = this.f13784a;
        a(windowInsetsAnimation);
        tr.e d10 = g2Var.d(new tr.e(bounds));
        d10.getClass();
        com.appsflyer.internal.k.q();
        return com.appsflyer.internal.k.j(((u3.c) d10.f36361b).d(), ((u3.c) d10.f36362c).d());
    }
}
