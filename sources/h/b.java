package h;

import android.R;
import android.content.res.TypedArray;
import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.ui.TrackSelectionView;
import b5.j1;
import b5.k1;
import b5.n1;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.ArrayList;
import java.util.HashMap;
import m.s3;

/* loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17578b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f17577a = i10;
        this.f17578b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        byte b10;
        Message message4 = null;
        l.q qVar = null;
        message4 = null;
        int i10 = this.f17577a;
        boolean z10 = false;
        boolean z11 = true;
        Object obj = this.f17578b;
        switch (i10) {
            case 0:
                h hVar = (h) obj;
                if (view == hVar.f17677k && (message3 = hVar.f17679m) != null) {
                    message4 = Message.obtain(message3);
                } else if (view == hVar.f17681o && (message2 = hVar.f17683q) != null) {
                    message4 = Message.obtain(message2);
                } else if (view == hVar.f17685s && (message = hVar.f17687u) != null) {
                    message4 = Message.obtain(message);
                }
                if (message4 != null) {
                    message4.sendToTarget();
                }
                hVar.K.obtainMessage(1, hVar.f17668b).sendToTarget();
                return;
            case 1:
                s3 s3Var = ((Toolbar) obj).f1116g0;
                if (s3Var != null) {
                    qVar = s3Var.f25719b;
                }
                if (qVar != null) {
                    qVar.collapseActionView();
                    return;
                }
                return;
            case 2:
                TrackSelectionView trackSelectionView = (TrackSelectionView) obj;
                CheckedTextView checkedTextView = trackSelectionView.f2135c;
                HashMap hashMap = trackSelectionView.f2139g;
                if (view == checkedTextView) {
                    trackSelectionView.f2144l = true;
                    hashMap.clear();
                } else if (view == trackSelectionView.f2136d) {
                    trackSelectionView.f2144l = false;
                    hashMap.clear();
                } else {
                    trackSelectionView.f2144l = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    d7.q0 q0Var = (d7.q0) tag;
                    n1 n1Var = q0Var.f14104a;
                    j1 j1Var = n1Var.f3552b;
                    k1 k1Var = (k1) hashMap.get(j1Var);
                    int i11 = q0Var.f14105b;
                    if (k1Var == null) {
                        if (!trackSelectionView.f2141i && hashMap.size() > 0) {
                            hashMap.clear();
                        }
                        hashMap.put(j1Var, new k1(j1Var, lp.o0.v(Integer.valueOf(i11))));
                    } else {
                        ArrayList arrayList = new ArrayList(k1Var.f3398b);
                        boolean isChecked = ((CheckedTextView) view).isChecked();
                        if (trackSelectionView.f2140h && n1Var.f3553c) {
                            b10 = true;
                        } else {
                            b10 = false;
                        }
                        if (b10 != false || (trackSelectionView.f2141i && trackSelectionView.f2138f.size() > 1)) {
                            z10 = true;
                        }
                        if (isChecked && z10) {
                            arrayList.remove(Integer.valueOf(i11));
                            if (arrayList.isEmpty()) {
                                hashMap.remove(j1Var);
                            } else {
                                hashMap.put(j1Var, new k1(j1Var, arrayList));
                            }
                        } else if (!isChecked) {
                            if (b10 != false) {
                                arrayList.add(Integer.valueOf(i11));
                                hashMap.put(j1Var, new k1(j1Var, arrayList));
                            } else {
                                hashMap.put(j1Var, new k1(j1Var, lp.o0.v(Integer.valueOf(i11))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                return;
            case 3:
                FloatingActionButton floatingActionButton = (FloatingActionButton) obj;
                View.OnClickListener onClickListener = floatingActionButton.f11001p;
                if (onClickListener != null) {
                    onClickListener.onClick(floatingActionButton);
                    return;
                }
                return;
            case 4:
                FloatingActionMenu floatingActionMenu = (FloatingActionMenu) obj;
                floatingActionMenu.b(floatingActionMenu.f11019f0);
                return;
            case 5:
                ao.f fVar = (ao.f) obj;
                if (fVar.f2665j && fVar.isShowing()) {
                    if (!fVar.f2667l) {
                        TypedArray obtainStyledAttributes = fVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        fVar.f2666k = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        fVar.f2667l = true;
                    }
                    if (fVar.f2666k) {
                        fVar.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                com.google.android.material.datepicker.l lVar = (com.google.android.material.datepicker.l) obj;
                int i12 = lVar.f11291e;
                if (i12 == 2) {
                    lVar.q(1);
                    return;
                } else {
                    if (i12 == 1) {
                        lVar.q(2);
                        return;
                    }
                    return;
                }
            case 7:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                mo.s sVar = (mo.s) obj;
                mo.k kVar = sVar.f27933e;
                if (kVar != null) {
                    kVar.f27922f = true;
                }
                l.q itemData = navigationMenuItemView.getItemData();
                boolean q10 = sVar.f27931c.q(itemData, sVar, 0);
                if (itemData != null && itemData.isCheckable() && q10) {
                    sVar.f27933e.q(itemData);
                } else {
                    z11 = false;
                }
                mo.k kVar2 = sVar.f27933e;
                if (kVar2 != null) {
                    kVar2.f27922f = false;
                }
                if (z11) {
                    sVar.d(false);
                    return;
                }
                return;
            default:
                l.q itemData2 = ((no.c) view).getItemData();
                no.e eVar = (no.e) obj;
                if (!eVar.C.q(itemData2, eVar.B, 0)) {
                    itemData2.setChecked(true);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(TrackSelectionView trackSelectionView) {
        this(trackSelectionView, 2);
        this.f17577a = 2;
    }
}
