package pm;

import com.github.clans.fab.FloatingActionMenu;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FloatingActionMenu f31200b;

    public /* synthetic */ h(FloatingActionMenu floatingActionMenu, int i10) {
        this.f31199a = i10;
        this.f31200b = floatingActionMenu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f31199a;
        FloatingActionMenu floatingActionMenu = this.f31200b;
        switch (i10) {
            case 0:
                floatingActionMenu.f11026j = true;
                return;
            default:
                floatingActionMenu.f11026j = false;
                return;
        }
    }
}
