package zo;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes2.dex */
public final class d extends m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f42593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(l lVar, int i10) {
        super(lVar);
        this.f42593e = i10;
    }

    @Override // zo.m
    public final void r() {
        switch (this.f42593e) {
            case 0:
                l lVar = this.f42638b;
                lVar.f42629o = null;
                CheckableImageButton checkableImageButton = lVar.f42621g;
                checkableImageButton.setOnLongClickListener(null);
                pn.e.x(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
