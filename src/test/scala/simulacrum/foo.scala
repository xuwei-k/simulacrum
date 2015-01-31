package simulacrum

@typeclass trait Foo[@specialized(Int, Long) A] {
  def foo(x: A, y: A): A
}
