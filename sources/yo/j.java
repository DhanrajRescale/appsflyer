package yo;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.material.tabs.TabLayout;
import d4.d1;
import d4.h0;
import d4.n1;
import d4.q;
import d4.v0;
import d4.w0;
import h4.p;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import qu.i0;

/* loaded from: classes2.dex */
public final class j extends LinearLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f41765l = 0;

    /* renamed from: a, reason: collision with root package name */
    public g f41766a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f41767b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f41768c;

    /* renamed from: d, reason: collision with root package name */
    public View f41769d;

    /* renamed from: e, reason: collision with root package name */
    public xn.a f41770e;

    /* renamed from: f, reason: collision with root package name */
    public View f41771f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f41772g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f41773h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f41774i;

    /* renamed from: j, reason: collision with root package name */
    public int f41775j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TabLayout f41776k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TabLayout tabLayout, Context context) {
        super(context);
        this.f41776k = tabLayout;
        this.f41775j = 2;
        e(context);
        int i10 = tabLayout.f11444e;
        WeakHashMap weakHashMap = n1.f13788a;
        w0.k(this, i10, tabLayout.f11446f, tabLayout.f11448g, tabLayout.f11450h);
        setGravity(17);
        setOrientation(!tabLayout.D ? 1 : 0);
        setClickable(true);
        d1.d(this, h0.b(getContext(), CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE));
    }

    private xn.a getBadge() {
        return this.f41770e;
    }

    @NonNull
    private xn.a getOrCreateBadge() {
        if (this.f41770e == null) {
            this.f41770e = new xn.a(getContext(), null);
        }
        b();
        xn.a aVar = this.f41770e;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void a() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        if (this.f41770e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f41769d;
            if (view != null) {
                xn.a aVar = this.f41770e;
                if (aVar != null) {
                    WeakReference weakReference = aVar.f40501m;
                    if (weakReference != null) {
                        frameLayout = (FrameLayout) weakReference.get();
                    } else {
                        frameLayout = null;
                    }
                    if (frameLayout != null) {
                        WeakReference weakReference2 = aVar.f40501m;
                        if (weakReference2 != null) {
                            frameLayout2 = (FrameLayout) weakReference2.get();
                        } else {
                            frameLayout2 = null;
                        }
                        frameLayout2.setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
                this.f41769d = null;
            }
        }
    }

    public final void b() {
        FrameLayout frameLayout;
        g gVar;
        FrameLayout frameLayout2;
        if (this.f41770e != null) {
            if (this.f41771f != null) {
                a();
                return;
            }
            ImageView imageView = this.f41768c;
            FrameLayout frameLayout3 = null;
            if (imageView != null && (gVar = this.f41766a) != null && gVar.f41752a != null) {
                if (this.f41769d != imageView) {
                    a();
                    ImageView imageView2 = this.f41768c;
                    if (this.f41770e != null && imageView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup = (ViewGroup) getParent();
                        if (viewGroup != null) {
                            viewGroup.setClipChildren(false);
                            viewGroup.setClipToPadding(false);
                        }
                        xn.a aVar = this.f41770e;
                        Rect rect = new Rect();
                        imageView2.getDrawingRect(rect);
                        aVar.setBounds(rect);
                        aVar.f(imageView2, null);
                        WeakReference weakReference = aVar.f40501m;
                        if (weakReference != null) {
                            frameLayout2 = (FrameLayout) weakReference.get();
                        } else {
                            frameLayout2 = null;
                        }
                        if (frameLayout2 != null) {
                            WeakReference weakReference2 = aVar.f40501m;
                            if (weakReference2 != null) {
                                frameLayout3 = (FrameLayout) weakReference2.get();
                            }
                            frameLayout3.setForeground(aVar);
                        } else {
                            imageView2.getOverlay().add(aVar);
                        }
                        this.f41769d = imageView2;
                        return;
                    }
                    return;
                }
                c(imageView);
                return;
            }
            TextView textView = this.f41767b;
            if (textView != null && this.f41766a != null) {
                if (this.f41769d != textView) {
                    a();
                    TextView textView2 = this.f41767b;
                    if (this.f41770e != null && textView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup2 = (ViewGroup) getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.setClipChildren(false);
                            viewGroup2.setClipToPadding(false);
                        }
                        xn.a aVar2 = this.f41770e;
                        Rect rect2 = new Rect();
                        textView2.getDrawingRect(rect2);
                        aVar2.setBounds(rect2);
                        aVar2.f(textView2, null);
                        WeakReference weakReference3 = aVar2.f40501m;
                        if (weakReference3 != null) {
                            frameLayout = (FrameLayout) weakReference3.get();
                        } else {
                            frameLayout = null;
                        }
                        if (frameLayout != null) {
                            WeakReference weakReference4 = aVar2.f40501m;
                            if (weakReference4 != null) {
                                frameLayout3 = (FrameLayout) weakReference4.get();
                            }
                            frameLayout3.setForeground(aVar2);
                        } else {
                            textView2.getOverlay().add(aVar2);
                        }
                        this.f41769d = textView2;
                        return;
                    }
                    return;
                }
                c(textView);
                return;
            }
            a();
        }
    }

    public final void c(View view) {
        xn.a aVar = this.f41770e;
        if (aVar != null && view == this.f41769d) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            aVar.setBounds(rect);
            aVar.f(view, null);
        }
    }

    public final void d() {
        boolean z10;
        f();
        g gVar = this.f41766a;
        if (gVar != null) {
            TabLayout tabLayout = gVar.f41757f;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == gVar.f41755d) {
                    z10 = true;
                    setSelected(z10);
                }
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }
        z10 = false;
        setSelected(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f41774i;
        if (drawable != null && drawable.isStateful() && this.f41774i.setState(drawableState)) {
            invalidate();
            this.f41776k.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
    public final void e(Context context) {
        TabLayout tabLayout = this.f41776k;
        int i10 = tabLayout.f11470t;
        GradientDrawable gradientDrawable = null;
        if (i10 != 0) {
            Drawable m10 = iu.j.m(context, i10);
            this.f41774i = m10;
            if (m10 != null && m10.isStateful()) {
                this.f41774i.setState(getDrawableState());
            }
        } else {
            this.f41774i = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        if (tabLayout.f11462n != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList a10 = ro.a.a(tabLayout.f11462n);
            boolean z10 = tabLayout.H;
            if (z10) {
                gradientDrawable2 = null;
            }
            if (!z10) {
                gradientDrawable = gradientDrawable3;
            }
            gradientDrawable2 = new RippleDrawable(a10, gradientDrawable2, gradientDrawable);
        }
        WeakHashMap weakHashMap = n1.f13788a;
        v0.q(this, gradientDrawable2);
        tabLayout.invalidate();
    }

    public final void f() {
        View view;
        int i10;
        ViewParent parent;
        g gVar = this.f41766a;
        if (gVar != null) {
            view = gVar.f41756e;
        } else {
            view = null;
        }
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f41771f;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f41771f);
                }
                addView(view);
            }
            this.f41771f = view;
            TextView textView = this.f41767b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f41768c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f41768c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.f41772g = textView2;
            if (textView2 != null) {
                this.f41775j = p.b(textView2);
            }
            this.f41773h = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.f41771f;
            if (view3 != null) {
                removeView(view3);
                this.f41771f = null;
            }
            this.f41772g = null;
            this.f41773h = null;
        }
        if (this.f41771f == null) {
            if (this.f41768c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.assetgro.stockgro.prod.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f41768c = imageView2;
                addView(imageView2, 0);
            }
            if (this.f41767b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.assetgro.stockgro.prod.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f41767b = textView3;
                addView(textView3);
                this.f41775j = p.b(this.f41767b);
            }
            TextView textView4 = this.f41767b;
            TabLayout tabLayout = this.f41776k;
            textView4.setTextAppearance(tabLayout.f11452i);
            if (isSelected() && (i10 = tabLayout.f11456k) != -1) {
                this.f41767b.setTextAppearance(i10);
            } else {
                this.f41767b.setTextAppearance(tabLayout.f11454j);
            }
            ColorStateList colorStateList = tabLayout.f11458l;
            if (colorStateList != null) {
                this.f41767b.setTextColor(colorStateList);
            }
            g(this.f41767b, this.f41768c, true);
            b();
            ImageView imageView3 = this.f41768c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new i(this, imageView3));
            }
            TextView textView5 = this.f41767b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new i(this, textView5));
            }
        } else {
            TextView textView6 = this.f41772g;
            if (textView6 != null || this.f41773h != null) {
                g(textView6, this.f41773h, false);
            }
        }
        if (gVar != null && !TextUtils.isEmpty(gVar.f41754c)) {
            setContentDescription(gVar.f41754c);
        }
    }

    public final void g(TextView textView, ImageView imageView, boolean z10) {
        Drawable drawable;
        CharSequence charSequence;
        int i10;
        CharSequence charSequence2;
        int i11;
        Drawable drawable2;
        g gVar = this.f41766a;
        CharSequence charSequence3 = null;
        if (gVar != null && (drawable2 = gVar.f41752a) != null) {
            drawable = drawable2.mutate();
        } else {
            drawable = null;
        }
        TabLayout tabLayout = this.f41776k;
        if (drawable != null) {
            v3.b.h(drawable, tabLayout.f11460m);
            PorterDuff.Mode mode = tabLayout.f11467q;
            if (mode != null) {
                v3.b.i(drawable, mode);
            }
        }
        g gVar2 = this.f41766a;
        if (gVar2 != null) {
            charSequence = gVar2.f41753b;
        } else {
            charSequence = null;
        }
        if (imageView != null) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z12) {
                this.f41766a.getClass();
            } else {
                z11 = false;
            }
            if (z12) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            textView.setText(charSequence2);
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
            if (z12) {
                setVisibility(0);
            }
        } else {
            z11 = false;
        }
        if (z10 && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (z11 && imageView.getVisibility() == 0) {
                i10 = (int) pn.e.f(8, getContext());
            } else {
                i10 = 0;
            }
            if (tabLayout.D) {
                if (i10 != q.b(marginLayoutParams)) {
                    q.g(marginLayoutParams, i10);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (i10 != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i10;
                q.g(marginLayoutParams, 0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        g gVar3 = this.f41766a;
        if (gVar3 != null) {
            charSequence3 = gVar3.f41754c;
        }
        if (!z12) {
            charSequence = charSequence3;
        }
        i0.L(this, charSequence);
    }

    public int getContentHeight() {
        View[] viewArr = {this.f41767b, this.f41768c, this.f41771f};
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        for (int i12 = 0; i12 < 3; i12++) {
            View view = viewArr[i12];
            if (view != null && view.getVisibility() == 0) {
                if (z10) {
                    i11 = Math.min(i11, view.getTop());
                } else {
                    i11 = view.getTop();
                }
                if (z10) {
                    i10 = Math.max(i10, view.getBottom());
                } else {
                    i10 = view.getBottom();
                }
                z10 = true;
            }
        }
        return i10 - i11;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f41767b, this.f41768c, this.f41771f};
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        for (int i12 = 0; i12 < 3; i12++) {
            View view = viewArr[i12];
            if (view != null && view.getVisibility() == 0) {
                if (z10) {
                    i11 = Math.min(i11, view.getLeft());
                } else {
                    i11 = view.getLeft();
                }
                if (z10) {
                    i10 = Math.max(i10, view.getRight());
                } else {
                    i10 = view.getRight();
                }
                z10 = true;
            }
        }
        return i10 - i11;
    }

    public g getTab() {
        return this.f41766a;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        xn.a aVar = this.f41770e;
        if (aVar != null && aVar.isVisible()) {
            accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f41770e.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) e4.l.a(0, 1, this.f41766a.f41755d, 1, false, isSelected()).f14994a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) e4.f.f14974g.f14989a);
        }
        e4.g.c(accessibilityNodeInfo).putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.assetgro.stockgro.prod.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        TabLayout tabLayout = this.f41776k;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i10 = View.MeasureSpec.makeMeasureSpec(tabLayout.f11471u, Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f41767b != null) {
            float f10 = tabLayout.f11468r;
            int i12 = this.f41775j;
            ImageView imageView = this.f41768c;
            if (imageView != null && imageView.getVisibility() == 0) {
                i12 = 1;
            } else {
                TextView textView = this.f41767b;
                if (textView != null && textView.getLineCount() > 1) {
                    f10 = tabLayout.f11469s;
                }
            }
            float textSize = this.f41767b.getTextSize();
            int lineCount = this.f41767b.getLineCount();
            int b10 = p.b(this.f41767b);
            if (f10 != textSize || (b10 >= 0 && i12 != b10)) {
                if (tabLayout.C == 1 && f10 > textSize && lineCount == 1) {
                    Layout layout = this.f41767b.getLayout();
                    if (layout != null) {
                        if ((f10 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.f41767b.setTextSize(0, f10);
                this.f41767b.setMaxLines(i12);
                super.onMeasure(i10, i11);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f41766a != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f41766a.a();
            return true;
        }
        return performClick;
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        isSelected();
        super.setSelected(z10);
        TextView textView = this.f41767b;
        if (textView != null) {
            textView.setSelected(z10);
        }
        ImageView imageView = this.f41768c;
        if (imageView != null) {
            imageView.setSelected(z10);
        }
        View view = this.f41771f;
        if (view != null) {
            view.setSelected(z10);
        }
    }

    public void setTab(g gVar) {
        if (gVar != this.f41766a) {
            this.f41766a = gVar;
            d();
        }
    }
}
