package com.firebase.ui.auth.ui.phone;

import am.a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.textfield.TextInputEditText;
import im.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m.a3;
import m.i2;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class CountryListSpinner extends TextInputEditText implements View.OnClickListener {

    /* renamed from: i, reason: collision with root package name */
    public final ArrayAdapter f10945i;

    /* renamed from: j, reason: collision with root package name */
    public View.OnClickListener f10946j;

    /* renamed from: k, reason: collision with root package name */
    public a f10947k;

    /* renamed from: l, reason: collision with root package name */
    public final i2 f10948l;

    /* renamed from: m, reason: collision with root package name */
    public HashSet f10949m;

    /* renamed from: n, reason: collision with root package name */
    public HashSet f10950n;

    public CountryListSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f10949m = new HashSet();
        this.f10950n = new HashSet();
        super.setOnClickListener(this);
        this.f10945i = new ArrayAdapter(getContext(), R.layout.fui_dgts_country_row, android.R.id.text1);
        i2 i2Var = new i2(context, null, R.attr.listPopupWindowStyle, 0);
        this.f10948l = i2Var;
        i2Var.f25582y = true;
        i2Var.f25583z.setFocusable(true);
        setInputType(0);
        i2Var.f25573p = new a3(this, 1);
    }

    public static HashSet c(ArrayList arrayList) {
        List list;
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String str2 = c.f20117a;
            if (str.startsWith("+") && c.c(str) != null) {
                if (str.startsWith("+") && c.c(str) != null) {
                    list = (List) c.f20120d.get(Integer.parseInt(str.substring(1)));
                } else {
                    list = null;
                }
                hashSet.addAll(list);
            } else {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    private void setDefaultCountryForSpinner(List<a> list) {
        a d10 = c.d(getContext());
        if (e(d10.f739b.getCountry())) {
            f(d10.f740c, d10.f739b);
        } else if (list.iterator().hasNext()) {
            a next = list.iterator().next();
            f(next.f740c, next.f739b);
        }
    }

    public final void d(View view, Bundle bundle) {
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("allowlisted_countries");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("blocklisted_countries");
            if (stringArrayList != null) {
                this.f10949m = c(stringArrayList);
            }
            if (stringArrayList2 != null) {
                this.f10950n = c(stringArrayList2);
            }
            if (c.f20121e == null) {
                c.f();
            }
            Map map = c.f20121e;
            if (this.f10949m.isEmpty() && this.f10950n.isEmpty()) {
                this.f10949m = new HashSet(map.keySet());
            }
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            if (!this.f10950n.isEmpty()) {
                hashSet.addAll(this.f10950n);
            } else {
                hashSet.addAll(map.keySet());
                hashSet.removeAll(this.f10949m);
            }
            for (String str : map.keySet()) {
                if (!hashSet.contains(str)) {
                    arrayList.add(new a(((Integer) map.get(str)).intValue(), new Locale(HttpUrl.FRAGMENT_ENCODE_SET, str)));
                }
            }
            Collections.sort(arrayList);
            setCountriesToDisplay(arrayList);
            setDefaultCountryForSpinner(arrayList);
            i2 i2Var = this.f10948l;
            i2Var.f25572o = view;
            i2Var.o(this.f10945i);
        }
    }

    public final boolean e(String str) {
        boolean z10;
        String upperCase = str.toUpperCase(Locale.getDefault());
        boolean z11 = true;
        if (!this.f10949m.isEmpty()) {
            z10 = this.f10949m.contains(upperCase);
        } else {
            z10 = true;
        }
        if (!this.f10950n.isEmpty()) {
            if (!z10 || this.f10950n.contains(upperCase)) {
                z11 = false;
            }
            return z11;
        }
        return z10;
    }

    public final void f(int i10, Locale locale) {
        a aVar = new a(i10, locale);
        this.f10947k = aVar;
        setText(a.a(aVar.f739b) + " +" + aVar.f740c);
    }

    public a getSelectedCountryInfo() {
        return this.f10947k;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
        View.OnClickListener onClickListener = this.f10946j;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        InputMethodManager inputMethodManager2 = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager2 != null) {
            inputMethodManager2.hideSoftInputFromWindow(getWindowToken(), 0);
        }
        this.f10948l.f();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            }
            this.f10948l.f();
            return;
        }
        this.f10948l.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("KEY_SUPER_STATE");
        this.f10947k = (a) bundle.getParcelable("KEY_COUNTRY_INFO");
        super.onRestoreInstanceState(parcelable2);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("KEY_SUPER_STATE", onSaveInstanceState);
        bundle.putParcelable("KEY_COUNTRY_INFO", this.f10947k);
        return bundle;
    }

    public void setCountriesToDisplay(List<a> list) {
        ArrayAdapter arrayAdapter = this.f10945i;
        arrayAdapter.addAll(list);
        arrayAdapter.notifyDataSetChanged();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f10946j = onClickListener;
    }
}
