package j9;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t.k0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public Map f21168c;

    /* renamed from: d, reason: collision with root package name */
    public Map f21169d;

    /* renamed from: e, reason: collision with root package name */
    public Map f21170e;

    /* renamed from: f, reason: collision with root package name */
    public List f21171f;

    /* renamed from: g, reason: collision with root package name */
    public k0 f21172g;

    /* renamed from: h, reason: collision with root package name */
    public t.o f21173h;

    /* renamed from: i, reason: collision with root package name */
    public List f21174i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f21175j;

    /* renamed from: k, reason: collision with root package name */
    public float f21176k;

    /* renamed from: l, reason: collision with root package name */
    public float f21177l;

    /* renamed from: m, reason: collision with root package name */
    public float f21178m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21179n;

    /* renamed from: a, reason: collision with root package name */
    public final e0 f21166a = new e0();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f21167b = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public int f21180o = 0;

    public final void a(String str) {
        w9.b.b(str);
        this.f21167b.add(str);
    }

    public final float b() {
        return ((this.f21177l - this.f21176k) / this.f21178m) * 1000.0f;
    }

    public final p9.h c(String str) {
        int size = this.f21171f.size();
        for (int i10 = 0; i10 < size; i10++) {
            p9.h hVar = (p9.h) this.f21171f.get(i10);
            String str2 = hVar.f30798a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return hVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f21174i.iterator();
        while (it.hasNext()) {
            sb2.append(((s9.e) it.next()).a("\t"));
        }
        return sb2.toString();
    }
}
