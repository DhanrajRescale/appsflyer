package d7;

import android.view.TextureView;
import android.view.View;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import b5.a1;
import b5.g1;
import b5.i1;
import b5.o1;
import b5.p1;
import b5.y0;
import b5.z0;

/* loaded from: classes.dex */
public final class e0 implements y0, View.OnLayoutChangeListener, View.OnClickListener, w, m {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f14006a = new g1();

    /* renamed from: b, reason: collision with root package name */
    public Object f14007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlayerView f14008c;

    public e0(PlayerView playerView) {
        this.f14008c = playerView;
    }

    @Override // b5.y0
    public final void h(int i10, boolean z10) {
        int i11 = PlayerView.f2097z;
        PlayerView playerView = this.f14008c;
        playerView.i();
        if (playerView.b() && playerView.f2120w) {
            x xVar = playerView.f2107j;
            if (xVar != null) {
                xVar.g();
                return;
            }
            return;
        }
        playerView.c(false);
    }

    @Override // b5.y0
    public final void l(int i10) {
        int i11 = PlayerView.f2097z;
        PlayerView playerView = this.f14008c;
        playerView.i();
        playerView.k();
        if (playerView.b() && playerView.f2120w) {
            x xVar = playerView.f2107j;
            if (xVar != null) {
                xVar.g();
                return;
            }
            return;
        }
        playerView.c(false);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = PlayerView.f2097z;
        this.f14008c.g();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        PlayerView.a((TextureView) view, this.f14008c.f2122y);
    }

    @Override // b5.y0
    public final void p(int i10, z0 z0Var, z0 z0Var2) {
        x xVar;
        int i11 = PlayerView.f2097z;
        PlayerView playerView = this.f14008c;
        if (playerView.b() && playerView.f2120w && (xVar = playerView.f2107j) != null) {
            xVar.g();
        }
    }

    @Override // b5.y0
    public final void r(o1 o1Var) {
        i1 i1Var;
        PlayerView playerView = this.f14008c;
        a1 a1Var = playerView.f2110m;
        a1Var.getClass();
        b5.i iVar = (b5.i) a1Var;
        if (iVar.b(17)) {
            i1Var = ((i5.g0) a1Var).w();
        } else {
            i1Var = i1.f3357a;
        }
        if (i1Var.q()) {
            this.f14007b = null;
        } else {
            boolean b10 = iVar.b(30);
            g1 g1Var = this.f14006a;
            if (b10) {
                i5.g0 g0Var = (i5.g0) a1Var;
                if (!g0Var.x().f3562a.isEmpty()) {
                    this.f14007b = i1Var.g(g0Var.t(), g1Var, true).f3317b;
                }
            }
            Object obj = this.f14007b;
            if (obj != null) {
                int b11 = i1Var.b(obj);
                if (b11 != -1) {
                    if (((i5.g0) a1Var).s() == i1Var.g(b11, g1Var, false).f3318c) {
                        return;
                    }
                }
                this.f14007b = null;
            }
        }
        playerView.l(false);
    }

    @Override // b5.y0
    public final void x(d5.c cVar) {
        SubtitleView subtitleView = this.f14008c.f2104g;
        if (subtitleView != null) {
            subtitleView.setCues(cVar.f13921a);
        }
    }

    @Override // b5.y0
    public final void y() {
        View view = this.f14008c.f2100c;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // b5.y0
    public final void z(p1 p1Var) {
        PlayerView playerView;
        a1 a1Var;
        if (!p1Var.equals(p1.f3567e) && (a1Var = (playerView = this.f14008c).f2110m) != null && ((i5.g0) a1Var).B() != 1) {
            playerView.h();
        }
    }
}
