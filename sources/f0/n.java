package f0;

import a2.u;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class n implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2.m f15903a;

    public n(c2.m mVar) {
        this.f15903a = mVar;
    }

    @Override // f0.d
    public final Object b0(u uVar, Function0 function0, yt.a aVar) {
        m1.d dVar;
        View view = (View) c2.g.p(this.f15903a, AndroidCompositionLocals_androidKt.f1433g);
        long m10 = androidx.compose.ui.layout.a.m(uVar);
        m1.d dVar2 = (m1.d) function0.mo2invoke();
        if (dVar2 != null) {
            dVar = dVar2.g(m10);
        } else {
            dVar = null;
        }
        if (dVar != null) {
            view.requestRectangleOnScreen(new Rect((int) dVar.f27239a, (int) dVar.f27240b, (int) dVar.f27241c, (int) dVar.f27242d), false);
        }
        return Unit.f23355a;
    }
}
