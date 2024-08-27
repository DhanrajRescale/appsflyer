package in.juspay.hypersdk.core;

import android.view.MenuItem;
import android.widget.PopupMenu;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20221c;

    public /* synthetic */ d(String str, int i10, Object obj) {
        this.f20219a = i10;
        this.f20221c = obj;
        this.f20220b = str;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i10 = this.f20219a;
        String str = this.f20220b;
        Object obj = this.f20221c;
        switch (i10) {
            case 0:
                return ((AndroidInterface) obj).lambda$showPopup$16(str, menuItem);
            default:
                return InflateView.d((InflateView) obj, str, menuItem);
        }
    }
}
