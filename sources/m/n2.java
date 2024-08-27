package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class n2 extends w1 {

    /* renamed from: m, reason: collision with root package name */
    public final int f25658m;

    /* renamed from: n, reason: collision with root package name */
    public final int f25659n;

    /* renamed from: o, reason: collision with root package name */
    public j2 f25660o;

    /* renamed from: p, reason: collision with root package name */
    public l.q f25661p;

    public n2(Context context, boolean z10) {
        super(context, z10);
        if (1 == m2.a(context.getResources().getConfiguration())) {
            this.f25658m = 21;
            this.f25659n = 22;
        } else {
            this.f25658m = 22;
            this.f25659n = 21;
        }
    }

    @Override // m.w1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.l lVar;
        int i10;
        l.q qVar;
        int pointToPosition;
        int i11;
        if (this.f25660o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i10 = headerViewListAdapter.getHeadersCount();
                lVar = (l.l) headerViewListAdapter.getWrappedAdapter();
            } else {
                lVar = (l.l) adapter;
                i10 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < lVar.getCount()) {
                qVar = lVar.getItem(i11);
            } else {
                qVar = null;
            }
            l.q qVar2 = this.f25661p;
            if (qVar2 != qVar) {
                l.o oVar = lVar.f23629a;
                if (qVar2 != null) {
                    this.f25660o.m(oVar, qVar2);
                }
                this.f25661p = qVar;
                if (qVar != null) {
                    this.f25660o.B(oVar, qVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.l lVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.f25658m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && i10 == this.f25659n) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                lVar = (l.l) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                lVar = (l.l) adapter;
            }
            lVar.f23629a.c(false);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public void setHoverListener(j2 j2Var) {
        this.f25660o = j2Var;
    }

    @Override // m.w1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
