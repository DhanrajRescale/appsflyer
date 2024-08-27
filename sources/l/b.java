package l;

import androidx.appcompat.view.menu.ActionMenuItemView;
import m.z1;

/* loaded from: classes.dex */
public final class b extends z1 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ActionMenuItemView f23558j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f23558j = actionMenuItemView;
    }

    @Override // m.z1
    public final g0 b() {
        m.h hVar;
        c cVar = this.f23558j.f897m;
        if (cVar == null || (hVar = ((m.i) cVar).f25544a.f25651u) == null) {
            return null;
        }
        return hVar.a();
    }

    @Override // m.z1
    public final boolean c() {
        g0 b10;
        ActionMenuItemView actionMenuItemView = this.f23558j;
        n nVar = actionMenuItemView.f895k;
        if (nVar == null || !nVar.a(actionMenuItemView.f892h) || (b10 = b()) == null || !b10.a()) {
            return false;
        }
        return true;
    }
}
