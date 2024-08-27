package d2;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import d2.x1;
import g1.n;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x1 implements View.OnDragListener, j1.b {

    /* renamed from: a, reason: collision with root package name */
    public final j1.e f13679a = new g1.n();

    /* renamed from: b, reason: collision with root package name */
    public final t.g f13680b = new t.g(0);

    /* renamed from: c, reason: collision with root package name */
    public final DragAndDropModifierOnDragListener$modifier$1 f13681c = new c2.y0() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        @Override // c2.y0
        public final n d() {
            return x1.this.f13679a;
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // c2.y0
        public final int hashCode() {
            return x1.this.f13679a.hashCode();
        }

        @Override // c2.y0
        public final /* bridge */ /* synthetic */ void j(n nVar) {
        }
    };

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        j1.a aVar = new j1.a(dragEvent);
        int action = dragEvent.getAction();
        j1.e eVar = this.f13679a;
        switch (action) {
            case 1:
                boolean Q0 = eVar.Q0(aVar);
                Iterator<E> it = this.f13680b.iterator();
                while (it.hasNext()) {
                    ((j1.e) ((j1.c) it.next())).W0(aVar);
                }
                return Q0;
            case 2:
                eVar.V0(aVar);
                return false;
            case 3:
                return eVar.R0(aVar);
            case 4:
                eVar.S0(aVar);
                return false;
            case 5:
                eVar.T0(aVar);
                return false;
            case 6:
                eVar.U0(aVar);
                return false;
            default:
                return false;
        }
    }
}
