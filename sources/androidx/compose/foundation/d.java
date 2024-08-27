package androidx.compose.foundation;

import a0.l;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import c2.y0;
import g1.n;
import g1.o;

/* loaded from: classes.dex */
public abstract class d {
    static {
        new y0() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            @Override // c2.y0
            public final n d() {
                return new n();
            }

            public final boolean equals(Object obj) {
                return this == obj;
            }

            @Override // c2.y0
            public final int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // c2.y0
            public final /* bridge */ /* synthetic */ void j(n nVar) {
            }
        };
    }

    public static final o a(o oVar, boolean z10, l lVar) {
        o oVar2;
        if (z10) {
            oVar2 = new FocusableElement(lVar).g(FocusTargetNode$FocusTargetElement.f1359b);
        } else {
            oVar2 = g1.l.f16404b;
        }
        return oVar.g(oVar2);
    }
}
