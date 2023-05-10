package main

import (
	"fmt"
	"github.com/gofiber/fiber/v2"
)

func main() {
	app := fiber.New()

	app.Get("/", func(c *fiber.Ctx) error {
		return c.SendString("📧 Email Service")
	})

	EmailRoute(app)
	fmt.Println("📧 Email service is running")
	app.Listen(":9040")
}
