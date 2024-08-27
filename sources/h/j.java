package h;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.assetgro.stockgro.prod.R;
import d4.c1;
import d4.n1;
import java.util.WeakHashMap;
import m.a2;

/* loaded from: classes.dex */
public final class j extends g0 implements DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    public final h f17699f;

    public j(Context context, int i10) {
        super(context, h(i10, context));
        this.f17699f = new h(getContext(), this, getWindow());
    }

    public static int h(int i10, Context context) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // h.g0, androidx.activity.o, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z10;
        int i10;
        View view;
        boolean z11;
        int i11;
        boolean z12;
        ListAdapter listAdapter;
        int i12;
        int i13;
        View findViewById;
        View findViewById2;
        super.onCreate(bundle);
        h hVar = this.f17699f;
        hVar.f17668b.setContentView(hVar.F);
        Window window = hVar.f17669c;
        View findViewById3 = window.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        View view2 = hVar.f17674h;
        int i14 = 0;
        Context context = hVar.f17667a;
        if (view2 == null) {
            if (hVar.f17675i != 0) {
                view2 = LayoutInflater.from(context).inflate(hVar.f17675i, viewGroup, false);
            } else {
                view2 = null;
            }
        }
        if (view2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !h.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (hVar.f17676j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (hVar.f17673g != null) {
                ((LinearLayout.LayoutParams) ((a2) viewGroup.getLayoutParams())).weight = s0.g.f34069a;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup c10 = h.c(findViewById7, findViewById4);
        ViewGroup c11 = h.c(findViewById8, findViewById5);
        ViewGroup c12 = h.c(findViewById9, findViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        hVar.f17689w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        hVar.f17689w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c11.findViewById(android.R.id.message);
        hVar.B = textView;
        if (textView != null) {
            CharSequence charSequence = hVar.f17672f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                hVar.f17689w.removeView(hVar.B);
                if (hVar.f17673g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) hVar.f17689w.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(hVar.f17689w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(hVar.f17673g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    c11.setVisibility(8);
                }
            }
        }
        Button button = (Button) c12.findViewById(android.R.id.button1);
        hVar.f17677k = button;
        b bVar = hVar.L;
        button.setOnClickListener(bVar);
        boolean isEmpty = TextUtils.isEmpty(hVar.f17678l);
        int i15 = hVar.f17670d;
        if (isEmpty && hVar.f17680n == null) {
            hVar.f17677k.setVisibility(8);
            i10 = 0;
        } else {
            hVar.f17677k.setText(hVar.f17678l);
            Drawable drawable = hVar.f17680n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i15, i15);
                hVar.f17677k.setCompoundDrawables(hVar.f17680n, null, null, null);
            }
            hVar.f17677k.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) c12.findViewById(android.R.id.button2);
        hVar.f17681o = button2;
        button2.setOnClickListener(bVar);
        if (TextUtils.isEmpty(hVar.f17682p) && hVar.f17684r == null) {
            hVar.f17681o.setVisibility(8);
        } else {
            hVar.f17681o.setText(hVar.f17682p);
            Drawable drawable2 = hVar.f17684r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i15, i15);
                hVar.f17681o.setCompoundDrawables(hVar.f17684r, null, null, null);
            }
            hVar.f17681o.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) c12.findViewById(android.R.id.button3);
        hVar.f17685s = button3;
        button3.setOnClickListener(bVar);
        if (TextUtils.isEmpty(hVar.f17686t) && hVar.f17688v == null) {
            hVar.f17685s.setVisibility(8);
            view = null;
        } else {
            hVar.f17685s.setText(hVar.f17686t);
            Drawable drawable3 = hVar.f17688v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i15, i15);
                view = null;
                hVar.f17685s.setCompoundDrawables(hVar.f17688v, null, null, null);
            } else {
                view = null;
            }
            hVar.f17685s.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i10 == 1) {
                Button button4 = hVar.f17677k;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i10 == 2) {
                Button button5 = hVar.f17681o;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == 4) {
                Button button6 = hVar.f17685s;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 == 0) {
            c12.setVisibility(8);
        }
        if (hVar.C != null) {
            c10.addView(hVar.C, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            hVar.f17692z = (ImageView) window.findViewById(android.R.id.icon);
            if ((!TextUtils.isEmpty(hVar.f17671e)) && hVar.J) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                hVar.A = textView2;
                textView2.setText(hVar.f17671e);
                int i16 = hVar.f17690x;
                if (i16 != 0) {
                    hVar.f17692z.setImageResource(i16);
                } else {
                    Drawable drawable4 = hVar.f17691y;
                    if (drawable4 != null) {
                        hVar.f17692z.setImageDrawable(drawable4);
                    } else {
                        hVar.A.setPadding(hVar.f17692z.getPaddingLeft(), hVar.f17692z.getPaddingTop(), hVar.f17692z.getPaddingRight(), hVar.f17692z.getPaddingBottom());
                        hVar.f17692z.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                hVar.f17692z.setVisibility(8);
                c10.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c10 != null && c10.getVisibility() != 8) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (c12.getVisibility() != 8) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && (findViewById2 = c11.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (i11 != 0) {
            NestedScrollView nestedScrollView2 = hVar.f17689w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (hVar.f17672f == null && hVar.f17673g == null) {
                findViewById = view;
            } else {
                findViewById = c10.findViewById(R.id.titleDividerNoCustom);
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            View findViewById10 = c11.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = hVar.f17673g;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z12 || i11 == 0) {
                int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                if (i11 != 0) {
                    i12 = alertController$RecycleListView.getPaddingTop();
                } else {
                    i12 = alertController$RecycleListView.f890a;
                }
                int paddingRight = alertController$RecycleListView.getPaddingRight();
                if (z12) {
                    i13 = alertController$RecycleListView.getPaddingBottom();
                } else {
                    i13 = alertController$RecycleListView.f891b;
                }
                alertController$RecycleListView.setPadding(paddingLeft, i12, paddingRight, i13);
            }
        }
        if (!z11) {
            View view3 = hVar.f17673g;
            if (view3 == null) {
                view3 = hVar.f17689w;
            }
            if (view3 != null) {
                if (z12) {
                    i14 = 2;
                }
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = n1.f13788a;
                c1.d(view3, i11 | i14, 3);
                if (findViewById11 != null) {
                    c11.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    c11.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = hVar.f17673g;
        if (alertController$RecycleListView2 != null && (listAdapter = hVar.D) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i17 = hVar.E;
            if (i17 > -1) {
                alertController$RecycleListView2.setItemChecked(i17, true);
                alertController$RecycleListView2.setSelection(i17);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f17699f.f17689w;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f17699f.f17689w;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // h.g0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        h hVar = this.f17699f;
        hVar.f17671e = charSequence;
        TextView textView = hVar.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
