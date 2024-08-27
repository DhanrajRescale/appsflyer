package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.ui.chat.discover.info.GroupDetailViewModel;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class i0 extends m4.m {
    public final TextView A;
    public final Toolbar B;
    public GroupDetailViewModel C;

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f4994s;

    /* renamed from: t, reason: collision with root package name */
    public final RecyclerView f4995t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f4996u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f4997v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f4998w;

    /* renamed from: x, reason: collision with root package name */
    public final MaterialButton f4999x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f5000y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f5001z;

    public i0(Object obj, View view, ConstraintLayout constraintLayout, RecyclerView recyclerView, ImageView imageView, TextView textView, ImageView imageView2, MaterialButton materialButton, TextView textView2, TextView textView3, TextView textView4, Toolbar toolbar) {
        super(obj, view, 6);
        this.f4994s = constraintLayout;
        this.f4995t = recyclerView;
        this.f4996u = imageView;
        this.f4997v = textView;
        this.f4998w = imageView2;
        this.f4999x = materialButton;
        this.f5000y = textView2;
        this.f5001z = textView3;
        this.A = textView4;
        this.B = toolbar;
    }
}
