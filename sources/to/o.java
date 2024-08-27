package to;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class o extends u {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f36304c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f36305d;

    public o(ArrayList arrayList, Matrix matrix) {
        this.f36304c = arrayList;
        this.f36305d = matrix;
    }

    @Override // to.u
    public final void a(Matrix matrix, so.a aVar, int i10, Canvas canvas) {
        Iterator it = this.f36304c.iterator();
        while (it.hasNext()) {
            ((u) it.next()).a(this.f36305d, aVar, i10, canvas);
        }
    }
}
