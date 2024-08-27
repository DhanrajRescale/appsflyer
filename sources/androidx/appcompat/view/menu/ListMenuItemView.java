package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import d4.n1;
import d4.v0;
import g.a;
import h.c;
import java.util.WeakHashMap;
import l.d0;
import l.q;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements d0, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public q f905a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f906b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f907c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f908d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f909e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f910f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f911g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f912h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f913i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f914j;

    /* renamed from: k, reason: collision with root package name */
    public final int f915k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f916l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f917m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f918n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f919o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f920p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f921q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c N = c.N(getContext(), attributeSet, a.f16366r, R.attr.listMenuViewStyle);
        this.f914j = N.v(5);
        this.f915k = N.C(1, -1);
        this.f917m = N.q(7, false);
        this.f916l = context;
        this.f918n = N.v(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f919o = obtainStyledAttributes.hasValue(0);
        N.R();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f920p == null) {
            this.f920p = LayoutInflater.from(getContext());
        }
        return this.f920p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        int i10;
        ImageView imageView = this.f911g;
        if (imageView != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f912h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f912h.getLayoutParams();
            rect.top = this.f912h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r0 != 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    @Override // l.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(l.q r11) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(l.q):void");
    }

    @Override // l.d0
    public q getItemData() {
        return this.f905a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = n1.f13788a;
        v0.q(this, this.f914j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f908d = textView;
        int i10 = this.f915k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f916l, i10);
        }
        this.f910f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f911g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f918n);
        }
        this.f912h = (ImageView) findViewById(R.id.group_divider);
        this.f913i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f906b != null && this.f917m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f906b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f907c == null && this.f909e == null) {
            return;
        }
        if ((this.f905a.f23686x & 4) != 0) {
            if (this.f907c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f907c = radioButton;
                LinearLayout linearLayout = this.f913i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f907c;
            view = this.f909e;
        } else {
            if (this.f909e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f909e = checkBox;
                LinearLayout linearLayout2 = this.f913i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f909e;
            view = this.f907c;
        }
        if (z10) {
            compoundButton.setChecked(this.f905a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f909e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f907c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f905a.f23686x & 4) != 0) {
            if (this.f907c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f907c = radioButton;
                LinearLayout linearLayout = this.f913i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f907c;
        } else {
            if (this.f909e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f909e = checkBox;
                LinearLayout linearLayout2 = this.f913i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f909e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f921q = z10;
        this.f917m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        int i10;
        ImageView imageView = this.f912h;
        if (imageView != null) {
            if (!this.f919o && z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f905a.f23676n.getClass();
        boolean z10 = this.f921q;
        if (!z10 && !this.f917m) {
            return;
        }
        ImageView imageView = this.f906b;
        if (imageView == null && drawable == null && !this.f917m) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.f906b = imageView2;
            LinearLayout linearLayout = this.f913i;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.f917m) {
            this.f906b.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f906b;
        if (!z10) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.f906b.getVisibility() != 0) {
            this.f906b.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f908d.setText(charSequence);
            if (this.f908d.getVisibility() != 0) {
                this.f908d.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f908d.getVisibility() != 8) {
            this.f908d.setVisibility(8);
        }
    }
}
