package f3;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d extends b {
    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    @Override // f3.b, f3.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && !Objects.equals(e(), ((d) obj).e())) {
            return false;
        }
        return super.equals(obj);
    }

    @Override // f3.b, f3.c
    public final int hashCode() {
        return super.hashCode();
    }
}
