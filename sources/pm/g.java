package pm;

import com.assetgro.stockgro.prod.R;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButton f31196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f31197c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FloatingActionMenu f31198d;

    public /* synthetic */ g(FloatingActionMenu floatingActionMenu, FloatingActionButton floatingActionButton, boolean z10, int i10) {
        this.f31195a = i10;
        this.f31198d = floatingActionMenu;
        this.f31196b = floatingActionButton;
        this.f31197c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f31195a;
        FloatingActionButton floatingActionButton = this.f31196b;
        boolean z10 = this.f31197c;
        FloatingActionMenu floatingActionMenu = this.f31198d;
        switch (i10) {
            case 0:
                if (!floatingActionMenu.f11026j) {
                    if (floatingActionButton != floatingActionMenu.f11016e) {
                        floatingActionButton.m(z10);
                    }
                    k kVar = (k) floatingActionButton.getTag(R.id.fab_label);
                    if (kVar != null && kVar.f31221q) {
                        if (z10 && kVar.f31218n != null) {
                            kVar.f31219o.cancel();
                            kVar.startAnimation(kVar.f31218n);
                        }
                        kVar.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (floatingActionMenu.f11026j) {
                    if (floatingActionButton != floatingActionMenu.f11016e) {
                        floatingActionButton.g(z10);
                    }
                    k kVar2 = (k) floatingActionButton.getTag(R.id.fab_label);
                    if (kVar2 != null && kVar2.f31221q) {
                        if (z10 && kVar2.f31219o != null) {
                            kVar2.f31218n.cancel();
                            kVar2.startAnimation(kVar2.f31219o);
                        }
                        kVar2.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
