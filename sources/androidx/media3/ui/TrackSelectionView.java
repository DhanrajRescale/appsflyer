package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import b5.j1;
import b5.k1;
import b5.n1;
import d7.g;
import d7.p0;
import d7.q0;
import h.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f2133a;

    /* renamed from: b, reason: collision with root package name */
    public final LayoutInflater f2134b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckedTextView f2135c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckedTextView f2136d;

    /* renamed from: e, reason: collision with root package name */
    public final b f2137e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2138f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f2139g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2140h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2141i;

    /* renamed from: j, reason: collision with root package name */
    public p0 f2142j;

    /* renamed from: k, reason: collision with root package name */
    public CheckedTextView[][] f2143k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2144l;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f2133a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f2134b = from;
        b bVar = new b(this);
        this.f2137e = bVar;
        this.f2142j = new g(getResources());
        this.f2138f = new ArrayList();
        this.f2139g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f2135c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.assetgro.stockgro.prod.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(com.assetgro.stockgro.prod.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f2136d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.assetgro.stockgro.prod.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    public final void a() {
        boolean z10;
        this.f2135c.setChecked(this.f2144l);
        boolean z11 = this.f2144l;
        HashMap hashMap = this.f2139g;
        if (!z11 && hashMap.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2136d.setChecked(z10);
        for (int i10 = 0; i10 < this.f2143k.length; i10++) {
            k1 k1Var = (k1) hashMap.get(((n1) this.f2138f.get(i10)).f3552b);
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f2143k[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (k1Var != null) {
                        Object tag = checkedTextViewArr[i11].getTag();
                        tag.getClass();
                        this.f2143k[i10][i11].setChecked(k1Var.f3398b.contains(Integer.valueOf(((q0) tag).f14105b)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    public final void b() {
        boolean z10;
        boolean z11;
        int i10;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f2138f;
        boolean isEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f2136d;
        CheckedTextView checkedTextView2 = this.f2135c;
        if (isEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f2143k = new CheckedTextView[arrayList.size()];
        if (this.f2141i && arrayList.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            n1 n1Var = (n1) arrayList.get(i11);
            if (this.f2140h && n1Var.f3553c) {
                z11 = true;
            } else {
                z11 = false;
            }
            CheckedTextView[][] checkedTextViewArr = this.f2143k;
            int i12 = n1Var.f3551a;
            checkedTextViewArr[i11] = new CheckedTextView[i12];
            q0[] q0VarArr = new q0[i12];
            for (int i13 = 0; i13 < n1Var.f3551a; i13++) {
                q0VarArr[i13] = new q0(n1Var, i13);
            }
            for (int i14 = 0; i14 < i12; i14++) {
                LayoutInflater layoutInflater = this.f2134b;
                if (i14 == 0) {
                    addView(layoutInflater.inflate(com.assetgro.stockgro.prod.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                if (!z11 && !z10) {
                    i10 = R.layout.simple_list_item_single_choice;
                } else {
                    i10 = R.layout.simple_list_item_multiple_choice;
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate(i10, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f2133a);
                p0 p0Var = this.f2142j;
                q0 q0Var = q0VarArr[i14];
                checkedTextView3.setText(((g) p0Var).c(q0Var.f14104a.f3552b.f3379d[q0Var.f14105b]));
                checkedTextView3.setTag(q0VarArr[i14]);
                if (n1Var.d(i14)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f2137e);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f2143k[i11][i14] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.f2144l;
    }

    public Map<j1, k1> getOverrides() {
        return this.f2139g;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f2140h != z10) {
            this.f2140h = z10;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f2141i != z10) {
            this.f2141i = z10;
            if (!z10) {
                HashMap hashMap = this.f2139g;
                if (hashMap.size() > 1) {
                    ArrayList arrayList = this.f2138f;
                    HashMap hashMap2 = new HashMap();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        k1 k1Var = (k1) hashMap.get(((n1) arrayList.get(i10)).f3552b);
                        if (k1Var != null && hashMap2.isEmpty()) {
                            hashMap2.put(k1Var.f3397a, k1Var);
                        }
                    }
                    hashMap.clear();
                    hashMap.putAll(hashMap2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f2135c.setVisibility(i10);
    }

    public void setTrackNameProvider(p0 p0Var) {
        p0Var.getClass();
        this.f2142j = p0Var;
        b();
    }
}
