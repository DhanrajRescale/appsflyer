package w8;

import android.graphics.Bitmap;
import java.util.Map;
import yk.o;

/* loaded from: classes.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final m f38866a;

    /* renamed from: b, reason: collision with root package name */
    public final h f38867b;

    public i(int i10, m mVar) {
        this.f38866a = mVar;
        this.f38867b = new h(i10, this);
    }

    @Override // w8.l
    public final void a(int i10) {
        h hVar = this.f38867b;
        if (i10 >= 40) {
            hVar.evictAll();
        } else if (10 <= i10 && i10 < 20) {
            hVar.trimToSize(hVar.size() / 2);
        }
    }

    @Override // w8.l
    public final d b(c cVar) {
        g gVar = (g) this.f38867b.get(cVar);
        if (gVar != null) {
            return new d(gVar.f38862a, gVar.f38863b);
        }
        return null;
    }

    @Override // w8.l
    public final void c(c cVar, Bitmap bitmap, Map map) {
        int P = o.P(bitmap);
        h hVar = this.f38867b;
        if (P <= hVar.maxSize()) {
            hVar.put(cVar, new g(bitmap, map, P));
        } else {
            hVar.remove(cVar);
            this.f38866a.y(cVar, bitmap, map, P);
        }
    }
}
