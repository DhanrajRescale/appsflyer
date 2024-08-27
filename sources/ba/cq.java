package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class cq extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final TextView f4404s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f4405t;

    /* renamed from: u, reason: collision with root package name */
    public final Group f4406u;

    /* renamed from: v, reason: collision with root package name */
    public final TabLayout f4407v;

    /* renamed from: w, reason: collision with root package name */
    public final Toolbar f4408w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f4409x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f4410y;

    /* renamed from: z, reason: collision with root package name */
    public final RecyclerView f4411z;

    public cq(Object obj, View view, TextView textView, ImageView imageView, Group group, TabLayout tabLayout, Toolbar toolbar, TextView textView2, TextView textView3, RecyclerView recyclerView) {
        super(obj, view, 0);
        this.f4404s = textView;
        this.f4405t = imageView;
        this.f4406u = group;
        this.f4407v = tabLayout;
        this.f4408w = toolbar;
        this.f4409x = textView2;
        this.f4410y = textView3;
        this.f4411z = recyclerView;
    }
}
