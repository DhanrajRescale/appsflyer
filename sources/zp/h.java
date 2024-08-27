package zp;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class h extends AbstractSafeParcelable implements w {
    public abstract String J();

    public abstract boolean R();

    public final Task S(d dVar) {
        Preconditions.checkNotNull(dVar);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(pp.g.e(((aq.g0) this).f2718c));
        firebaseAuth.getClass();
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(this);
        return firebaseAuth.f11631e.zzm(firebaseAuth.f11627a, this, dVar.R(), new z(firebaseAuth, 0));
    }

    public abstract aq.g0 U(List list);

    public abstract void X(ArrayList arrayList);

    public abstract Uri getPhotoUrl();
}
