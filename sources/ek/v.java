package ek;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final xj.g f15628a;

    /* renamed from: b, reason: collision with root package name */
    public final List f15629b;

    /* renamed from: c, reason: collision with root package name */
    public final yj.e f15630c;

    public v(xj.g gVar, yj.e eVar) {
        List emptyList = Collections.emptyList();
        if (gVar != null) {
            this.f15628a = gVar;
            if (emptyList != null) {
                this.f15629b = emptyList;
                if (eVar != null) {
                    this.f15630c = eVar;
                    return;
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }
}
