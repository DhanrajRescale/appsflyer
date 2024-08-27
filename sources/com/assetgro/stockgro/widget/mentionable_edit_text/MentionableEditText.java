package com.assetgro.stockgro.widget.mentionable_edit_text;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.prod.R;
import h.m0;
import java.util.ArrayList;
import k7.z0;
import ke.a;
import sj.b;
import sj.c;
import sj.d;
import sj.f;
import sj.h;

/* loaded from: classes.dex */
public class MentionableEditText extends FrameLayout implements c, f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10752a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10753b;

    /* renamed from: c, reason: collision with root package name */
    public final CustomEditText f10754c;

    /* renamed from: d, reason: collision with root package name */
    public final h f10755d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f10756e;

    /* renamed from: f, reason: collision with root package name */
    public View f10757f;

    /* renamed from: g, reason: collision with root package name */
    public a f10758g;

    /* renamed from: h, reason: collision with root package name */
    public PopupWindow f10759h;

    /* renamed from: i, reason: collision with root package name */
    public sj.a f10760i;

    /* renamed from: j, reason: collision with root package name */
    public b f10761j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [sj.h, k7.z0] */
    public MentionableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new ArrayList();
        this.f10752a = new ArrayList();
        this.f10753b = false;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.layout_mentionable_edit_text, this);
        this.f10754c = (CustomEditText) findViewById(R.id.met);
        this.f10756e = new RecyclerView(context, null);
        ?? z0Var = new z0();
        this.f10755d = z0Var;
        z0Var.f34669e = this;
        this.f10756e.setAdapter(z0Var);
        this.f10756e.setLayoutManager(new LinearLayoutManager(1));
        if (this.f10760i != null) {
            this.f10754c.setOnClickListener(new ph.a(this, 21));
        }
        if (this.f10761j != null) {
            this.f10754c.setOnFocusChangeListener(new fc.a(this, 2));
        }
    }

    public CustomEditText getEditText() {
        return this.f10754c;
    }

    public void setClickListener(sj.a aVar) {
        this.f10760i = aVar;
    }

    public void setFocusListener(b bVar) {
        this.f10761j = bVar;
    }

    public void setInputList(ArrayList<d> arrayList) {
        this.f10754c.setInputList(arrayList);
        this.f10754c.setMainView(this);
    }

    public void setListener(a aVar) {
        this.f10754c.setListener(aVar);
        this.f10758g = aVar;
    }

    public void setMentionedUser(String str) {
        this.f10752a.add(str);
    }

    @Override // sj.c
    public void setSuggestionList(ArrayList<d> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            new Handler().post(new m0(23, this, arrayList));
        }
    }
}
