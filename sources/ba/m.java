package ba;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class m extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f5411s;

    /* renamed from: t, reason: collision with root package name */
    public final MaterialButton f5412t;

    /* renamed from: u, reason: collision with root package name */
    public final Toolbar f5413u;

    public m(Object obj, View view, RecyclerView recyclerView, MaterialButton materialButton, Toolbar toolbar) {
        super(obj, view, 0);
        this.f5411s = recyclerView;
        this.f5412t = materialButton;
        this.f5413u = toolbar;
    }
}
