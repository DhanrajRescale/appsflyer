package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import d5.a;
import d5.b;
import d5.e;
import d7.c;
import d7.d;
import d7.n0;
import d7.t0;
import e5.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import yk.g;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public List f2123a;

    /* renamed from: b, reason: collision with root package name */
    public d f2124b;

    /* renamed from: c, reason: collision with root package name */
    public int f2125c;

    /* renamed from: d, reason: collision with root package name */
    public float f2126d;

    /* renamed from: e, reason: collision with root package name */
    public float f2127e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2128f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2129g;

    /* renamed from: h, reason: collision with root package name */
    public int f2130h;

    /* renamed from: i, reason: collision with root package name */
    public n0 f2131i;

    /* renamed from: j, reason: collision with root package name */
    public View f2132j;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2123a = Collections.emptyList();
        this.f2124b = d.f13971g;
        this.f2125c = 0;
        this.f2126d = 0.0533f;
        this.f2127e = 0.08f;
        this.f2128f = true;
        this.f2129g = true;
        c cVar = new c(context);
        this.f2131i = cVar;
        this.f2132j = cVar;
        addView(cVar);
        this.f2130h = 1;
    }

    private List<b> getCuesWithStylingPreferencesApplied() {
        if (this.f2128f && this.f2129g) {
            return this.f2123a;
        }
        ArrayList arrayList = new ArrayList(this.f2123a.size());
        for (int i10 = 0; i10 < this.f2123a.size(); i10++) {
            a a10 = ((b) this.f2123a.get(i10)).a();
            if (!this.f2128f) {
                a10.f13890n = false;
                CharSequence charSequence = a10.f13877a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        a10.f13877a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = a10.f13877a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof e)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                g.U(a10);
            } else if (!this.f2129g) {
                g.U(a10);
            }
            arrayList.add(a10.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (x.f15050a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private d getUserCaptionStyle() {
        CaptioningManager captioningManager;
        d dVar;
        int i10;
        int i11;
        int i12;
        int i13 = x.f15050a;
        d dVar2 = d.f13971g;
        if (i13 >= 19 && !isInEditMode() && (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            if (i13 >= 21) {
                int i14 = -1;
                if (userStyle.hasForegroundColor()) {
                    i10 = userStyle.foregroundColor;
                } else {
                    i10 = -1;
                }
                if (userStyle.hasBackgroundColor()) {
                    i11 = userStyle.backgroundColor;
                } else {
                    i11 = -16777216;
                }
                int i15 = i11;
                int i16 = 0;
                if (userStyle.hasWindowColor()) {
                    i12 = userStyle.windowColor;
                } else {
                    i12 = 0;
                }
                if (userStyle.hasEdgeType()) {
                    i16 = userStyle.edgeType;
                }
                int i17 = i16;
                if (userStyle.hasEdgeColor()) {
                    i14 = userStyle.edgeColor;
                }
                dVar = new d(i10, i15, i12, i17, i14, userStyle.getTypeface());
            } else {
                dVar = new d(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
            }
            return dVar;
        }
        return dVar2;
    }

    private <T extends View & n0> void setView(T t10) {
        removeView(this.f2132j);
        View view = this.f2132j;
        if (view instanceof t0) {
            ((t0) view).f14117b.destroy();
        }
        this.f2132j = t10;
        this.f2131i = t10;
        addView(t10);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.f2131i.a(getCuesWithStylingPreferencesApplied(), this.f2124b, this.f2126d, this.f2125c, this.f2127e);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f2129g = z10;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f2128f = z10;
        c();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f2127e = f10;
        c();
    }

    public void setCues(List<b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f2123a = list;
        c();
    }

    public void setFractionalTextSize(float f10) {
        this.f2125c = 0;
        this.f2126d = f10;
        c();
    }

    public void setStyle(d dVar) {
        this.f2124b = dVar;
        c();
    }

    public void setViewType(int i10) {
        if (this.f2130h == i10) {
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                setView(new t0(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            setView(new c(getContext()));
        }
        this.f2130h = i10;
    }
}
