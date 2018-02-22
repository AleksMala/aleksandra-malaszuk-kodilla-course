package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

public class BookSignature {
    private final String signature;

    public BookSignature(String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookSignature)) return false;

        BookSignature that = (BookSignature) o;

        return getSignature().equals(that.getSignature());
    }

    @Override
    public int hashCode() {
        return getSignature().hashCode();
    }
}
