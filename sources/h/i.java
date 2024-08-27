package h;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final e f17693a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17694b;

    public i(Context context) {
        this(context, j.h(0, context));
    }

    public i a() {
        this.f17693a.f17616k = false;
        return this;
    }

    public i b(String str) {
        this.f17693a.f17611f = str;
        return this;
    }

    public final void c() {
        create().show();
    }

    @NonNull
    public j create() {
        int i10;
        e eVar = this.f17693a;
        j jVar = new j(eVar.f17606a, this.f17694b);
        View view = eVar.f17610e;
        h hVar = jVar.f17699f;
        if (view != null) {
            hVar.C = view;
        } else {
            CharSequence charSequence = eVar.f17609d;
            if (charSequence != null) {
                hVar.f17671e = charSequence;
                TextView textView = hVar.A;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = eVar.f17608c;
            if (drawable != null) {
                hVar.f17691y = drawable;
                hVar.f17690x = 0;
                ImageView imageView = hVar.f17692z;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    hVar.f17692z.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = eVar.f17611f;
        if (charSequence2 != null) {
            hVar.f17672f = charSequence2;
            TextView textView2 = hVar.B;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = eVar.f17612g;
        if (charSequence3 != null) {
            hVar.d(-1, charSequence3, eVar.f17613h);
        }
        CharSequence charSequence4 = eVar.f17614i;
        if (charSequence4 != null) {
            hVar.d(-2, charSequence4, eVar.f17615j);
        }
        if (eVar.f17619n != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) eVar.f17607b.inflate(hVar.G, (ViewGroup) null);
            if (eVar.f17622q) {
                i10 = hVar.H;
            } else {
                i10 = hVar.I;
            }
            ListAdapter listAdapter = eVar.f17619n;
            if (listAdapter == null) {
                listAdapter = new ArrayAdapter(eVar.f17606a, i10, R.id.text1, (Object[]) null);
            }
            hVar.D = listAdapter;
            hVar.E = eVar.f17623r;
            if (eVar.f17620o != null) {
                alertController$RecycleListView.setOnItemClickListener(new d(0, eVar, hVar));
            }
            if (eVar.f17622q) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            hVar.f17673g = alertController$RecycleListView;
        }
        View view2 = eVar.f17621p;
        if (view2 != null) {
            hVar.f17674h = view2;
            hVar.f17675i = 0;
            hVar.f17676j = false;
        }
        jVar.setCancelable(eVar.f17616k);
        if (eVar.f17616k) {
            jVar.setCanceledOnTouchOutside(true);
        }
        jVar.setOnCancelListener(null);
        jVar.setOnDismissListener(eVar.f17617l);
        DialogInterface.OnKeyListener onKeyListener = eVar.f17618m;
        if (onKeyListener != null) {
            jVar.setOnKeyListener(onKeyListener);
        }
        return jVar;
    }

    @NonNull
    public Context getContext() {
        return this.f17693a.f17606a;
    }

    public i setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
        e eVar = this.f17693a;
        eVar.f17614i = eVar.f17606a.getText(i10);
        eVar.f17615j = onClickListener;
        return this;
    }

    public i setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
        e eVar = this.f17693a;
        eVar.f17612g = eVar.f17606a.getText(i10);
        eVar.f17613h = onClickListener;
        return this;
    }

    public i setTitle(CharSequence charSequence) {
        this.f17693a.f17609d = charSequence;
        return this;
    }

    public i setView(View view) {
        this.f17693a.f17621p = view;
        return this;
    }

    public i(@NonNull Context context, int i10) {
        this.f17693a = new e(new ContextThemeWrapper(context, j.h(i10, context)));
        this.f17694b = i10;
    }
}
